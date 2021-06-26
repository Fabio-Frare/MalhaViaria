
package br.udesc.dsd.model.casa;

import br.udesc.dsd.model.carro.ICarro;

/**
 *
 * @author fabio
 */
public interface ICasa {

    public void addRota(Movimentacao command);

    public Movimentacao getRota();

    public int getColunm();

    public int getRow();

    public int getValor();

    public void liberarRecurso();

    public void mover(ICarro carro);

    public boolean reservarCasa();

    public void setCarro(ICarro carro);

    public ICarro getCarro();

    public ICarro removerCarro();

    public void repintar();

}
