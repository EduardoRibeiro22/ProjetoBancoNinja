package entities;

import OrganizationEnumAndOther.AddBooksAndClients;

import java.util.ArrayList;

public abstract class RulesLibrary implements AddBooksAndClients {

        private ArrayList<Livro> ListaLivros =  new ArrayList<>();
        private ArrayList<Cliente> ListaClientes =  new ArrayList<>();




        @Override
        public final void AdicionarLivro(Livro livro) {
            ListaLivros.add(livro);
    }
        @Override
        public final void AdicionarCliente(Cliente cliente) {
            ListaClientes.add(cliente);
    }

    public ArrayList<Livro> getListaLivros() {
        return ListaLivros;
    }

    public void setListaLivros(ArrayList<Livro> listaLivros) {
        ListaLivros = listaLivros;
    }

    public ArrayList<Cliente> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        ListaClientes = listaClientes;
    }
}
