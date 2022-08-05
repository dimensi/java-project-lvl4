package hexlet.code.controllers;

import io.javalin.http.Handler;

public final class UrlController {
    public static Handler handleInput = (ctx) -> {
        var url = ctx.formParam("url");

        ctx.result(String.format("result: %s", url));
    };
}
