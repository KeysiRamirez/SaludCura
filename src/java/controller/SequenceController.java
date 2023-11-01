package controller;

import CRUD.Sequence;
import facade.SequenceFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "sequenceController")
@ViewScoped
public class SequenceController extends AbstractController<Sequence> {

    @Inject
    private MobilePageController mobilePageController;

    public SequenceController() {
        // Inform the Abstract parent controller of the concrete Sequence Entity
        super(Sequence.class);
    }

}
