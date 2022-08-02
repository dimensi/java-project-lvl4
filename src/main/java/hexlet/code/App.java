package hexlet.code;

import io.javalin.Javalin;

public class App {
    private static int getPort() {
        String port = System.getenv().getOrDefault("PORT", "7070");
        return Integer.valueOf(port);
    }

    public static Javalin getApp() {
        var app = Javalin.create();
        app.get("/", ctx -> ctx.result("Hello world!"));

        return app;
    }

    public static void main(final String[] args) {
        getApp().start(getPort());
    }
}
