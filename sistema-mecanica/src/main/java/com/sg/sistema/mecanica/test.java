package com.sg.sistema.mecanica;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class test {

    public static void main(String[] args) {
        //define datas
        LocalDateTime dataCadastro = LocalDateTime.of(2015, 1, 1, 0, 0, 0);
        LocalDateTime hoje = LocalDateTime.now();

//calcula diferenç
        long meses = dataCadastro.until(hoje, ChronoUnit.DAYS);
        System.out.println(meses);
//        Calendar dataInicio=Calendar.getInstance();
//        Calendar dataFim=Calendar.getInstance();
//        dataFim.set(Calendar.MONTH, 11);
//        dataFim.set(Calendar.DAY_OF_MONTH, 25);
//
//        System.out.println((dataInicio.getTime().getTime() - dataFim.getTime().getTime()) / (1000 * 60 * 60 * 24));
//
//        Calendar dataInicio;
//        Calendar dataFim ;
//        LocalDate inicio = Instant.ofEpochMilli(this.getDataInicio().getTimeInMillis()).atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate fim = Instant.ofEpochMilli(this.getDataFim().getTimeInMillis()).atZone(ZoneId.systemDefault()).toLocalDate();
//        int diasCorridos = Period.between(inicio, fim).getDays();
//        System.out.println(diasCorridos);


    }
}
