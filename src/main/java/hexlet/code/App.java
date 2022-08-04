package hexlet.code;

import io.javalin.Javalin;

public class App {
    private static int getPort() {
        String port = System.getenv().getOrDefault("PORT", "7070");
        return Integer.valueOf(port);
    }

    private static String getMode() {
        return System.getenv().getOrDefault("APP_ENV", "development");
    }

    private static boolean isProduction() {
        return getMode().equals("production");
    }

    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.enableDevLogging();
        });
        app.get("/", ctx -> ctx.result("Hello world! 2"));

        return app;
    }

    public static void main(final String[] args) {
        getApp().start(getPort());
    }
}
