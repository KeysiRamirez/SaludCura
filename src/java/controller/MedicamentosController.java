package controller;

import CRUD.Medicamentos;
import facade.MedicamentosFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "medicamentosController")
@ViewScoped
public class MedicamentosController extends AbstractController<Medicamentos> {

    @Inject
    private MobilePageController mobilePageController;

    public MedicamentosController() {
        // Inform the Abstract parent controller of the concrete Medicamentos Entity
        super(Medicamentos.class);
    }

}
