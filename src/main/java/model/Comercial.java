
package model;

import java.time.LocalDate;

/**
 *
 * @author SARA
 */
public class Comercial extends Imovel{
    protected float impostoFederal;

    public Comercial(float impostoFederal, int codImovel, String endereco, LocalDate dataConstrucao, float areaTotaL, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu, float valorVenda, float valorAluguel) {
        super(codImovel, endereco, dataConstrucao, areaTotaL, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIptu, valorVenda, valorAluguel);
        this.impostoFederal = impostoFederal;
    }

    public float getImpostoFederal() {
        return impostoFederal;
    }

    public void setImpostoFederal(float impostoFederal) {
        this.impostoFederal = impostoFederal;
    }

    @Override
    public String toString() {
        return "impostoFederal=" + impostoFederal + '}';
    }
    
    
    
}
