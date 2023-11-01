package controller;

import CRUD.Farmacos;
import facade.FarmacosFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "farmacosController")
@ViewScoped
public class FarmacosController extends AbstractController<Farmacos> {

    @Inject
    private MobilePageController mobilePageController;

    public FarmacosController() {
        // Inform the Abstract parent controller of the concrete Farmacos Entity
        super(Farmacos.class);
    }

}
