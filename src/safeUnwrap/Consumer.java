package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Model myModel = (Wrapper) model;

        return myModel.getColor();
    }
}
