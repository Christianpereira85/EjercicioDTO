package dto;

import BO.ArticuloBO;
import VO.ArticuloVO;


public class Main {

	public static void main(String[] args) {

		
		// Objeto BO
		ArticuloBO articulo = new ArticuloBO();
		
		//obtiene todos los articulos
		 articulo.obtenerArticulos().forEach(System.out::println);
		 
		// actualiza un articulo - Cambio azucar por Azucarlito
			System.out.println("****");
			ArticuloVO artaux = articulo.obtenerArticulo(0);
			artaux.setNombre("Azucarlito x 1kg.");
			articulo.actualizarArticulo(artaux);
			
			// obtiene un Articulo
			System.out.println("****");
			artaux=articulo.obtenerArticulo(0);
			System.out.println(artaux);
			
			//elimina un Articulo
			System.out.println("****");
			artaux=articulo.obtenerArticulo(0);
			articulo.eliminarArticulo(artaux);
			
			//obtiene todos los Articulos
			 articulo.obtenerArticulos().forEach(System.out::println);

	}

}
