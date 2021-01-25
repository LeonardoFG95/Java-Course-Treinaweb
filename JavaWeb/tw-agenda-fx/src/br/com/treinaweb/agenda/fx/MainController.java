package br.com.treinaweb.agenda.fx;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import br.com.treinaweb.agenda.entidades.Contato;
import br.com.treinaweb.agenda.repositorios.impl.ContatoRepositorio;
import br.com.treinaweb.agenda.repositorios.impl.ContatoRepositorioJDBC;
import br.com.treinaweb.agenda.repositorios.interfaces.AgendaRepositorio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	private TableView<Contato> tabelaContatos;
	@FXML
	private Button btnIncluir;
	@FXML
	private Button btnAlterar;
	@FXML
	private Button btnExcluir;
	@FXML
	private TextField txfNome;
	@FXML
	private TextField txfIdade;
	@FXML
	private TextField txfTelefone;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnCancelar;

	private boolean ehInserir;

	private Contato contatoSelecionado;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.tabelaContatos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		habilitarEdicaoAgenda(false);
//		this.tabelaContatos.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contato>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Contato> observable, Contato oldValue, Contato newValue) {
//				if (newValue != null) {
//					txfNome.setText(newValue.getNome());
//					txfIdade.setText(String.valueOf(newValue.getIdade()));
//					txfTelefone.setText(newValue.getTelefone());
//				}
//			}			
//		});
		this.tabelaContatos.getSelectionModel().selectedItemProperty()
				.addListener((observador, contatoAntigo, contatoNovo) -> {
					if (contatoNovo != null) {
						txfNome.setText(contatoNovo.getNome());
						txfIdade.setText(String.valueOf(contatoNovo.getIdade()));
						txfTelefone.setText(contatoNovo.getTelefone());
						this.contatoSelecionado = contatoNovo;
					}
				});
		carregarTabelaContatos();
	}

	public void botaoInserir_Action() {
		this.ehInserir = true;
		this.txfNome.setText("");
		this.txfIdade.setText("");
		this.txfTelefone.setText("");
		habilitarEdicaoAgenda(true);
	}

	public void botaoAlterar_Action() {
		habilitarEdicaoAgenda(true);
		this.ehInserir = false;
		this.txfNome.setText(this.contatoSelecionado.getNome());
		this.txfIdade.setText(Integer.toString(this.contatoSelecionado.getIdade()));
		this.txfTelefone.setText(this.contatoSelecionado.getTelefone());
	}

	public void botaoExcluir_Action() throws SQLException, IOException {
		Alert confirmacao = new Alert(AlertType.CONFIRMATION);
		confirmacao.setTitle("Confirmação");
		confirmacao.setContentText("Tem certeza que deseja excluir estes contato?");
		Optional<ButtonType> resultadoConfirmacao = confirmacao.showAndWait();
		if (resultadoConfirmacao.isPresent() && resultadoConfirmacao.get() == ButtonType.OK) {
			AgendaRepositorio<Contato> repositorioContato = new ContatoRepositorio();
			repositorioContato.excluir(this.contatoSelecionado);
			carregarTabelaContatos();
			this.tabelaContatos.getSelectionModel().selectFirst();
		}
	}

	public void botaoCancelar_Action() {
		habilitarEdicaoAgenda(false);
		this.tabelaContatos.getSelectionModel().selectFirst();
	}

	public void botaoSalvar_Action() {
		try {
			AgendaRepositorio<Contato> repositorioContato = new ContatoRepositorioJDBC();
			Contato contato = new Contato();
			contato.setNome(txfNome.getText());
			contato.setIdade(Integer.parseInt(txfIdade.getText()));
			contato.setTelefone(txfTelefone.getText());
			if (this.ehInserir) {
				repositorioContato.inserir(contato);
			} else {
				repositorioContato.atualizar(contato);
			}
			habilitarEdicaoAgenda(false);
			carregarTabelaContatos();
			this.tabelaContatos.getSelectionModel().selectFirst();
		} catch (Exception e) {
			Alert mensagem = new Alert(AlertType.ERROR);
			mensagem.setTitle("Erro!");
			mensagem.setHeaderText("Erro no banco de dados.");
			mensagem.setContentText("Houve um erro ao manipular o contato: " + e.getMessage());
			mensagem.showAndWait();
		}
	}

	private void carregarTabelaContatos() {
		try {
			AgendaRepositorio<Contato> repositorioContato = new ContatoRepositorioJDBC();
			List<Contato> contatos = repositorioContato.selecionar();
			ObservableList<Contato> contatosObservableList = FXCollections.observableList(contatos);
			this.tabelaContatos.getItems().setAll(contatosObservableList);
		} catch (Exception e) {
			Alert mensagem = new Alert(AlertType.ERROR);
			mensagem.setTitle("Erro!");
			mensagem.setHeaderText("Erro no banco de dados.");
			mensagem.setContentText("Houve um erro ao obter a lista de contatos: " + e.getMessage());
			mensagem.showAndWait();
		}
	}

	private void habilitarEdicaoAgenda(Boolean edicaoHabilitada) {
		this.txfNome.setDisable(!edicaoHabilitada);
		this.txfIdade.setDisable(!edicaoHabilitada);
		this.txfTelefone.setDisable(!edicaoHabilitada);
		this.btnSalvar.setDisable(!edicaoHabilitada);
		this.btnCancelar.setDisable(!edicaoHabilitada);
		this.btnIncluir.setDisable(edicaoHabilitada);
		this.btnAlterar.setDisable(edicaoHabilitada);
		this.btnExcluir.setDisable(edicaoHabilitada);
		this.tabelaContatos.setDisable(edicaoHabilitada);
	}

}
