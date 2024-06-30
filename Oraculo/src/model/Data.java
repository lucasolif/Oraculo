
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Data {
    
    SimpleDateFormat formatoData;
    Calendar data; 
    
    public String conversaoData(){
        this.data = Calendar.getInstance();
        this.formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formatoData.format(this.data.getTime());
        
        return data;
    }
    
    public LocalDate conversaoStringData(String data) throws ParseException{
        
        //convert String to LocalDate: o primeiro parâmetro é a data e o segundo é o formato da data que veio do usuario
        LocalDate dataFormatada = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        /*
        
        this.formatoData = new SimpleDateFormat("yyyy/MM/dd");
        Date dataFormatada = formatoData.parse(formatoData.format(data));
        
        /* Convertendo data utilizando o Calendar
        this.formatoData = new SimpleDateFormat("yyyy/MM/dd"); 
        this.data = Calendar.getInstance(); 
        this.data.setTime(formatoData.parse(data));
        */
        
        
        return dataFormatada;
    }
    
    public Date dataAtual() throws ParseException{
        
        /*Data atual com o LocalDate.
        LocalDate dataAtual = LocalDate.now();
        */
 
        Date dataAtual = new Date();
        this.formatoData = new SimpleDateFormat("yyyy/MM/dd");
        Date dataAtualFormatada = formatoData.parse(formatoData.format(data));
        
        /* Pegando a data atal com o Calendar
        this.data = Calendar.getInstance(); 
        this.formatoData = new SimpleDateFormat("yyyy/MM/dd"); 
        this.formatoData.format(data);
        */
        
        return dataAtual;
    }
    
    public Date conversaoLocalDataParaDate(LocalDate data) throws ParseException{
        
        //Convertendo de LocalDate para date.
        Date dataConvertida = Date.from(data.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        //Formantando a data Date.
        this.formatoData = new SimpleDateFormat("yyyy/MM/dd");
        Date dataFormatada = formatoData.parse(formatoData.format(dataConvertida));
    
        return dataFormatada;
    }
}
