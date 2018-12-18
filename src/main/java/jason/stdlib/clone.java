package jason.stdlib;

import jason.asSemantics.DefaultInternalAction;
import jason.asSemantics.TransitionSystem;
import jason.asSemantics.Unifier;
import jason.asSyntax.StringTerm;
import jason.asSyntax.Term;
import jason.runtime.RuntimeServices;

public class clone extends DefaultInternalAction {

    @Override
    public Object execute(TransitionSystem ts, Unifier un, Term[] args) throws Exception {

        String agName = ((StringTerm)args[0]).getString();
        RuntimeServices services = ts.getUserAgArch().getRuntimeServices();
        services.clone(ts.getAg(), ts.getUserAgArch().getAgArchClassesChain(), agName);

        return true;
    }
}

