package controller;

import CRUD.Pacientes;
import facade.PacientesFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "pacientesController")
@ViewScoped
public class PacientesController extends AbstractController<Pacientes> {

    @Inject
    private MobilePageController mobilePageController;

    public PacientesController() {
        // Inform the Abstract parent controller of the concrete Pacientes Entity
        super(Pacientes.class);
    }

}
