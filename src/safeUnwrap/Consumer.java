package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Model myModel =  model;

        return myModel.getColor();
    }
}
