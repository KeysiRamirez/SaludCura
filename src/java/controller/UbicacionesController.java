package controller;

import CRUD.Ubicaciones;
import facade.UbicacionesFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "ubicacionesController")
@ViewScoped
public class UbicacionesController extends AbstractController<Ubicaciones> {

    @Inject
    private MobilePageController mobilePageController;

    public UbicacionesController() {
        // Inform the Abstract parent controller of the concrete Ubicaciones Entity
        super(Ubicaciones.class);
    }

}
