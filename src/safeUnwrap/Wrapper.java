package safeUnwrap;

public class Wrapper extends Model{
    private Model Wrapped;

    private Wrapper(Model wrapped) {
        super(wrapped.getColor(), wrapped.getAmount());
        Wrapped = wrapped;
    }

}
