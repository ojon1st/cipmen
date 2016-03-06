package controllers.utils;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by brabo on 3/2/16.
 */
public class Secured extends Security.Authenticator {
    @Override
    public String getUsername(Http.Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return redirect("/connexion");
    }
}
