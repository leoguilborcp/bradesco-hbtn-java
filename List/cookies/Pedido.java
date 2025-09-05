import java.util.*;
public class Pedido{
    ArrayList<PedidoCookie> cookies;

    public Pedido(){
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido){
        cookies.add(pedido);
    }

    public int obterTotalCaixas(){
        int total = 0;
        for(PedidoCookie pedido : cookies){
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor){
        int totalRemovidos = 0;
        for(int i = 0; i < cookies.size(); i++){
            if(cookies.get(i).getSabor().equals(sabor)){
                totalRemovidos += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
                i--;
            }
        }
        return totalRemovidos;
    }
}