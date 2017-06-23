package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Model myModel = Wrapper.createWrapper(model);

        return myModel.getColor();
    }
}
