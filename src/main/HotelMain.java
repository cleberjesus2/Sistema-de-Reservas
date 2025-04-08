package main;

import model.Hospede;
import service.HospedeService;

public class HotelMain {
    public static void main(String[] args) {
        Hospede hospede [] = new Hospede[20];
        HospedeService hospedes = new HospedeService();

        hospede[0] = new Hospede("11 91212 - 1212", "551.121.912-12","Clebao", "clebao@gmail.com");

        hospedes.cadastrarHospede(hospede[0]);

        hospedes.editarDados(hospede[0],"123.3455.129", "Clebin", "clebin@gmail.com", "1109912-1221");

        hospedes.consultarDados(hospede[0]);
    }
}
