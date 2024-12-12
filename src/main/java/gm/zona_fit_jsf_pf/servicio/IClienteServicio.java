package gm.zona_fit_jsf_pf.servicio;

import gm.zona_fit_jsf_pf.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Integer idCliente);
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
