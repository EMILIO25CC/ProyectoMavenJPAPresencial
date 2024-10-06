package Interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
//Declaramos los métodos
	
	void RegistrarProducto(TblProducto producto);
	void ActualizarProducto(TblProducto producto);
	void EliminarProducto(TblProducto producto);
	
	List<TblProducto> ListadoProducto();
	TblProducto BusacarProducto(TblProducto producto);
	
	
}//Fin del Método 
