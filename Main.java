package github.com.ricallinson.expresso;

import github.com.ricallinson.http.Server;

public class Main {

    public static void main(String[] args) {
        Server s = Server.createServer((req, res) -> {
            String body = "<h1>Hello world</h1>";
            res.end(body.getBytes());
        });
        s.listen(8080);
    }
}
