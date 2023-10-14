/**
 * Two sum solution
 * @author Román
 * @see {@link https://github.com/RomanKornyeyev} - GitHub profile
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> letrasContenidas = new ArrayList<String>();
        String letraActual="";
        int acumulador=0;

        //si el string no está vacío
        if(s.length() > 0) {
            //la longitud mínima del substring por tanto será de 1
        	acumulador=1;

        	//recorremos el string
            for(int i=0; i<s.length(); i++){
                //letra actual
                letraActual=s.substring(i, i+1);
                
                //le metemos la letra actual al array de letras contenidas
                //para posteriormente mirar las laterales
                letrasContenidas.add(letraActual);

                //búsqueda lateral derecho
            	for(int post=i+1; post<s.length(); post++) {
            		if(!letrasContenidas.contains(s.substring(post, post+1))) 
            			letrasContenidas.add(s.substring(post, post+1));
            		else
            			break;
            	}

                //suma acumulador
                if(!letrasContenidas.isEmpty() && letrasContenidas.size() > acumulador){
            		acumulador = letrasContenidas.size();
            	}

                //vaciado array para comprobar la siguiente letra con sus laterales
                letrasContenidas.clear();
            }
        }
        
        return acumulador;
    }
}