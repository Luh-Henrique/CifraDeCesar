package cifradecesar;

public class CifraDeCesar {

    public String codifica(String mensagem, int key){
        char[] arrayMensagem = mensagem.toCharArray();
        char[] cifra = new char[arrayMensagem.length];
        
        for(int i=0; i<arrayMensagem.length;i++){
                if(arrayMensagem[i] == ' ')
                cifra[i] = ' ';
            else{
                char aux = (char) (((arrayMensagem[i]-65 + key)%26)+65);
                
                cifra[i] = (char) (aux);
            }
        }
        
        return new String(cifra);
    }
    
    public String decodifica(String mensagem, int key){
        char[] arrayMensagem = mensagem.toCharArray();
        char[] cifra = new char[arrayMensagem.length];
        
        for(int i=0; i<arrayMensagem.length;i++){
                
            if(arrayMensagem[i] == ' ')
                cifra[i] = ' ';
            
            else{
                char aux = (char) (((arrayMensagem[i]-65 - key)%26)+65);
                
                while(aux <65)
                    aux += 26;
                
                cifra[i] = (char) (aux);
            }
                
            }
        
        return new String(cifra);
    }
    
    public static void main(String[] args) {
        CifraDeCesar cesar = new CifraDeCesar();
        String mensagem = "Tudo que vai volta mas nem tudo que volta encontra o que deixou";
        int key = 15;
        
        String codificada = cesar.codifica(mensagem.toUpperCase(), key);
        
        System.out.println("\nCodificada: "+codificada);
        
        String decodificada = cesar.decodifica(codificada.toUpperCase(), key);
        
        System.out.println("\nDecodificada: "+decodificada);
    }
    
}
