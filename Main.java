package github.com.ricallinson.expresso;

import github.com.ricallinson.http.Server;

public class Main {

    public static void main(String[] args) {
        Server s = Server.createServer((req, res) -> {
            res.end("<h1>Hello world</h1>");
        });
        s.listen(8080);
    }
}
