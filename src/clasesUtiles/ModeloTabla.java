

package clasesUtiles;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel{
    private ArrayList filas = null;
    private String[] cols = null;
    
    public ModeloTabla(ArrayList lin, String[] col){
        setFilas(lin);
        setCols(col);
    }

    public ArrayList getFilas() {
        return filas;
    }

    public void setFilas(ArrayList filas) {
        this.filas = filas;
    }

    public String[] getCols() {
        return cols;
    }

    public void setCols(String[] cols) {
        this.cols = cols;
    }
    
    
    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    @Override
    public String getColumnName(int colIndex){
        return cols[colIndex];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linea = (Object[]) getFilas().get(rowIndex);
        return linea[columnIndex];
    }
    
}
