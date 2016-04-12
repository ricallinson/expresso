package github.com.ricallinson.expresso;

import github.com.jminusminus.http.Server;

public class Main {

    public static void main(String[] args) {
        Server.createServer((req, res) -> {
            res.end("<h1>Hello world</h1>");
        }).listen(8080);
    }
}
