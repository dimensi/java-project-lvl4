package hexlet.code.domain;

import io.ebean.DB;
import org.junit.jupiter.api.Test;


class UrlTest {

    @Test
    public void insertFindDelete() {
        Url url = new Url("https://hexlet.io");
        url.save();

        var foundUrl = DB.find(url.getClass(), 1);

        foundUrl.delete();
    }

}
