/**
 *
 * @author José Flávio
 */
public class exames {
    
    private String resultado;
    float quantidade;
    
    public String calculaTriglicérides(){
        
        if (quantidade < 150)//1
            resultado = "Desejável";//2
        else if (quantidade < 199)//3
            resultado = "Limítrofe";//4
        else if (quantidade < 499)//5
            resultado = "Alto";//6
        else
            resultado = "Nível muito alto";//7
        return resultado;//8
    }
    
    public String calculaColesterolTotal(){
        
        if (quantidade < 200)//1
            resultado = "Desejável";//2
        else if (quantidade < 240)//3
            resultado = "Limítrofe";//4
        else
            resultado = "Elevado";//5
        return resultado;//6
    }
    
    public String calculaColesterolHDL(){
        
        if (quantidade < 40)//1
            resultado = "Baixo";//2
        else if (quantidade <= 60)//3
            resultado = "Normal";//4
        else
            resultado = "Desejável";//5
        return resultado;//6
    }
    
    public String calculaColesterolVLDL(){
        
        if (quantidade < 30)//1
            resultado = "Nível desejável";//2
        else if (quantidade <= 40)//3
            resultado = "Nível Limítrofe";//4
        else
            resultado = "Nível Elevado";//5
        return resultado;//6
    }
    
    public String calculaGlicose(){
        
        if (quantidade < 60)//1
            resultado = "Hipoglicemia";//2
        else if (quantidade <= 99)//3
            resultado = "Desejável";//4
        else if (quantidade <= 125)//5
            resultado = "Glicemia de jejum inapropriada";//6
        else
            resultado = "Diabetes";//7
        return resultado;//8
    }
    
    
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
