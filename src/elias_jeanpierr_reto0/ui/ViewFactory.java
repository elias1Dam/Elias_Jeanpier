/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elias_jeanpierr_reto0.ui;
import elias_jeanpierr_reto0.ui.ViewImplementation;
import elias_jeanpierr_reto0.ui.ViewInterface;
/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static ViewInterface mostrar;
    public static ViewInterface getView() {
	if (mostrar == null) {
		mostrar = new ViewImplementation();
	}
	return mostrar;
    }
}