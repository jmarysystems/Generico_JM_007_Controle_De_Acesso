/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_de_acesso_beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author NewUser
 */
@Entity
@Table(name = "CONTROLE_DE_ACESSO", catalog = "", schema = "JM")
@NamedQueries({
    @NamedQuery(name = "ControleDeAcesso.findAll", query = "SELECT c FROM ControleDeAcesso c")
    , @NamedQuery(name = "ControleDeAcesso.findById", query = "SELECT c FROM ControleDeAcesso c WHERE c.id = :id")
    , @NamedQuery(name = "ControleDeAcesso.findByNomeDaTabela", query = "SELECT c FROM ControleDeAcesso c WHERE c.nomeDaTabela = :nomeDaTabela")
    , @NamedQuery(name = "ControleDeAcesso.findByIdUsuarioSistemaQueVaiAcessar", query = "SELECT c FROM ControleDeAcesso c WHERE c.idUsuarioSistemaQueVaiAcessar = :idUsuarioSistemaQueVaiAcessar")
    , @NamedQuery(name = "ControleDeAcesso.findByAcessoATabela", query = "SELECT c FROM ControleDeAcesso c WHERE c.acessoATabela = :acessoATabela")
    , @NamedQuery(name = "ControleDeAcesso.findByVisualizar", query = "SELECT c FROM ControleDeAcesso c WHERE c.visualizar = :visualizar")
    , @NamedQuery(name = "ControleDeAcesso.findByConsultar", query = "SELECT c FROM ControleDeAcesso c WHERE c.consultar = :consultar")
    , @NamedQuery(name = "ControleDeAcesso.findByAlterar", query = "SELECT c FROM ControleDeAcesso c WHERE c.alterar = :alterar")
    , @NamedQuery(name = "ControleDeAcesso.findByExcluir", query = "SELECT c FROM ControleDeAcesso c WHERE c.excluir = :excluir")
    , @NamedQuery(name = "ControleDeAcesso.findByConsultaSql", query = "SELECT c FROM ControleDeAcesso c WHERE c.consultaSql = :consultaSql")
    , @NamedQuery(name = "ControleDeAcesso.findByCadastrar", query = "SELECT c FROM ControleDeAcesso c WHERE c.cadastrar = :cadastrar")
    , @NamedQuery(name = "ControleDeAcesso.findByCadastroAuto", query = "SELECT c FROM ControleDeAcesso c WHERE c.cadastroAuto = :cadastroAuto")
    , @NamedQuery(name = "ControleDeAcesso.findByDataCadastro", query = "SELECT c FROM ControleDeAcesso c WHERE c.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "ControleDeAcesso.findByIdUsuarioSistemaCadastroControleDeAcesso", query = "SELECT c FROM ControleDeAcesso c WHERE c.idUsuarioSistemaCadastroControleDeAcesso = :idUsuarioSistemaCadastroControleDeAcesso")
    , @NamedQuery(name = "ControleDeAcesso.findByDataAlteracao", query = "SELECT c FROM ControleDeAcesso c WHERE c.dataAlteracao = :dataAlteracao")
    , @NamedQuery(name = "ControleDeAcesso.findByIdUsuarioSistemaAlteracaoControleDeAcesso", query = "SELECT c FROM ControleDeAcesso c WHERE c.idUsuarioSistemaAlteracaoControleDeAcesso = :idUsuarioSistemaAlteracaoControleDeAcesso")})
public class ControleDeAcesso implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NOME_DA_TABELA", nullable = false, length = 100)
    private String nomeDaTabela;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO_SISTEMA_QUE_VAI_ACESSAR", nullable = false)
    private int idUsuarioSistemaQueVaiAcessar;
    @Basic(optional = false)
    @Column(name = "ACESSO_A_TABELA", nullable = false)
    private Boolean acessoATabela;
    @Basic(optional = false)
    @Column(name = "VISUALIZAR", nullable = false)
    private Boolean visualizar;
    @Basic(optional = false)
    @Column(name = "CONSULTAR", nullable = false)
    private Boolean consultar;
    @Basic(optional = false)
    @Column(name = "ALTERAR", nullable = false)
    private Boolean alterar;
    @Basic(optional = false)
    @Column(name = "EXCLUIR", nullable = false)
    private Boolean excluir;
    @Basic(optional = false)
    @Column(name = "CONSULTA_SQL", nullable = false)
    private Boolean consultaSql;
    @Basic(optional = false)
    @Column(name = "CADASTRAR", nullable = false)
    private Boolean cadastrar;
    @Basic(optional = false)
    @Column(name = "CADASTRO_AUTO", nullable = false)
    private Boolean cadastroAuto;
    @Basic(optional = false)
    @Column(name = "DATA_CADASTRO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO_SISTEMA_CADASTRO_CONTROLE_DE_ACESSO", nullable = false)
    private int idUsuarioSistemaCadastroControleDeAcesso;
    @Basic(optional = false)
    @Column(name = "DATA_ALTERACAO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO_SISTEMA_ALTERACAO_CONTROLE_DE_ACESSO", nullable = false)
    private int idUsuarioSistemaAlteracaoControleDeAcesso;

    public ControleDeAcesso() {
    }

    public ControleDeAcesso(Integer id) {
        this.id = id;
    }

    public ControleDeAcesso(Integer id, String nomeDaTabela, int idUsuarioSistemaQueVaiAcessar, Boolean acessoATabela, Boolean visualizar, Boolean consultar, Boolean alterar, Boolean excluir, Boolean consultaSql, Boolean cadastrar, Boolean cadastroAuto, Date dataCadastro, int idUsuarioSistemaCadastroControleDeAcesso, Date dataAlteracao, int idUsuarioSistemaAlteracaoControleDeAcesso) {
        this.id = id;
        this.nomeDaTabela = nomeDaTabela;
        this.idUsuarioSistemaQueVaiAcessar = idUsuarioSistemaQueVaiAcessar;
        this.acessoATabela = acessoATabela;
        this.visualizar = visualizar;
        this.consultar = consultar;
        this.alterar = alterar;
        this.excluir = excluir;
        this.consultaSql = consultaSql;
        this.cadastrar = cadastrar;
        this.cadastroAuto = cadastroAuto;
        this.dataCadastro = dataCadastro;
        this.idUsuarioSistemaCadastroControleDeAcesso = idUsuarioSistemaCadastroControleDeAcesso;
        this.dataAlteracao = dataAlteracao;
        this.idUsuarioSistemaAlteracaoControleDeAcesso = idUsuarioSistemaAlteracaoControleDeAcesso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeDaTabela() {
        return nomeDaTabela;
    }

    public void setNomeDaTabela(String nomeDaTabela) {
        String oldNomeDaTabela = this.nomeDaTabela;
        this.nomeDaTabela = nomeDaTabela;
        changeSupport.firePropertyChange("nomeDaTabela", oldNomeDaTabela, nomeDaTabela);
    }

    public int getIdUsuarioSistemaQueVaiAcessar() {
        return idUsuarioSistemaQueVaiAcessar;
    }

    public void setIdUsuarioSistemaQueVaiAcessar(int idUsuarioSistemaQueVaiAcessar) {
        int oldIdUsuarioSistemaQueVaiAcessar = this.idUsuarioSistemaQueVaiAcessar;
        this.idUsuarioSistemaQueVaiAcessar = idUsuarioSistemaQueVaiAcessar;
        changeSupport.firePropertyChange("idUsuarioSistemaQueVaiAcessar", oldIdUsuarioSistemaQueVaiAcessar, idUsuarioSistemaQueVaiAcessar);
    }

    public Boolean getAcessoATabela() {
        return acessoATabela;
    }

    public void setAcessoATabela(Boolean acessoATabela) {
        Boolean oldAcessoATabela = this.acessoATabela;
        this.acessoATabela = acessoATabela;
        changeSupport.firePropertyChange("acessoATabela", oldAcessoATabela, acessoATabela);
    }

    public Boolean getVisualizar() {
        return visualizar;
    }

    public void setVisualizar(Boolean visualizar) {
        Boolean oldVisualizar = this.visualizar;
        this.visualizar = visualizar;
        changeSupport.firePropertyChange("visualizar", oldVisualizar, visualizar);
    }

    public Boolean getConsultar() {
        return consultar;
    }

    public void setConsultar(Boolean consultar) {
        Boolean oldConsultar = this.consultar;
        this.consultar = consultar;
        changeSupport.firePropertyChange("consultar", oldConsultar, consultar);
    }

    public Boolean getAlterar() {
        return alterar;
    }

    public void setAlterar(Boolean alterar) {
        Boolean oldAlterar = this.alterar;
        this.alterar = alterar;
        changeSupport.firePropertyChange("alterar", oldAlterar, alterar);
    }

    public Boolean getExcluir() {
        return excluir;
    }

    public void setExcluir(Boolean excluir) {
        Boolean oldExcluir = this.excluir;
        this.excluir = excluir;
        changeSupport.firePropertyChange("excluir", oldExcluir, excluir);
    }

    public Boolean getConsultaSql() {
        return consultaSql;
    }

    public void setConsultaSql(Boolean consultaSql) {
        Boolean oldConsultaSql = this.consultaSql;
        this.consultaSql = consultaSql;
        changeSupport.firePropertyChange("consultaSql", oldConsultaSql, consultaSql);
    }

    public Boolean getCadastrar() {
        return cadastrar;
    }

    public void setCadastrar(Boolean cadastrar) {
        Boolean oldCadastrar = this.cadastrar;
        this.cadastrar = cadastrar;
        changeSupport.firePropertyChange("cadastrar", oldCadastrar, cadastrar);
    }

    public Boolean getCadastroAuto() {
        return cadastroAuto;
    }

    public void setCadastroAuto(Boolean cadastroAuto) {
        Boolean oldCadastroAuto = this.cadastroAuto;
        this.cadastroAuto = cadastroAuto;
        changeSupport.firePropertyChange("cadastroAuto", oldCadastroAuto, cadastroAuto);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        Date oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    public int getIdUsuarioSistemaCadastroControleDeAcesso() {
        return idUsuarioSistemaCadastroControleDeAcesso;
    }

    public void setIdUsuarioSistemaCadastroControleDeAcesso(int idUsuarioSistemaCadastroControleDeAcesso) {
        int oldIdUsuarioSistemaCadastroControleDeAcesso = this.idUsuarioSistemaCadastroControleDeAcesso;
        this.idUsuarioSistemaCadastroControleDeAcesso = idUsuarioSistemaCadastroControleDeAcesso;
        changeSupport.firePropertyChange("idUsuarioSistemaCadastroControleDeAcesso", oldIdUsuarioSistemaCadastroControleDeAcesso, idUsuarioSistemaCadastroControleDeAcesso);
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        Date oldDataAlteracao = this.dataAlteracao;
        this.dataAlteracao = dataAlteracao;
        changeSupport.firePropertyChange("dataAlteracao", oldDataAlteracao, dataAlteracao);
    }

    public int getIdUsuarioSistemaAlteracaoControleDeAcesso() {
        return idUsuarioSistemaAlteracaoControleDeAcesso;
    }

    public void setIdUsuarioSistemaAlteracaoControleDeAcesso(int idUsuarioSistemaAlteracaoControleDeAcesso) {
        int oldIdUsuarioSistemaAlteracaoControleDeAcesso = this.idUsuarioSistemaAlteracaoControleDeAcesso;
        this.idUsuarioSistemaAlteracaoControleDeAcesso = idUsuarioSistemaAlteracaoControleDeAcesso;
        changeSupport.firePropertyChange("idUsuarioSistemaAlteracaoControleDeAcesso", oldIdUsuarioSistemaAlteracaoControleDeAcesso, idUsuarioSistemaAlteracaoControleDeAcesso);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControleDeAcesso)) {
            return false;
        }
        ControleDeAcesso other = (ControleDeAcesso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controle_de_acesso_beans.ControleDeAcesso[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
