package herramientas;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.jpcomponents.JPCalendar;
import com.jpcomponents.events.IJPCalendarDateListener;
import com.jpcomponents.events.JPCalendarEvent;
//import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.text.JTextComponent;

@SuppressWarnings("unused")
public class Calendario extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPCalendar cal=null;
	private String fecha;
	private String nombreCampo;
	/**
	 * This is the default constructor
	 */
	public Calendario(JTextField campo) {
		super();
		
		
		initialize(campo);
	}
	
	/**
	 * This method initializes this
	 * @param campo 
	 * 
	 * @return void
	 */
	private void initialize(JTextField campo) {
		
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setContentPane(getJContentPane(campo));
		
		
		this.setTitle("Calendario");
	}
	
	
	private JPCalendar getCalendarioII(final JTextField campo){
		cal=new JPCalendar();
		cal.addDateChangeListener(new IJPCalendarDateListener() {

			
			public void onDateChanged(JPCalendarEvent arg0) {
				SimpleDateFormat formateador = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
				
		         fecha =formateador.format(arg0.getCalendar().getTime());
		        
				System.out.println(fecha);
				campo.setText(fecha);
				dispose();
		         
				
			}
				
});

		return cal;
		
	}
	
	/*public String FechaCalendario ( ){
		cal=new JPCalendar();
		cal.addDateChangeListener(new IJPCalendarDateListener() {

			
			public void onDateChanged(JPCalendarEvent arg0) {
				SimpleDateFormat formateador = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
				
		         fecha =formateador.format(arg0.getCalendar().getTime());
		        SoldeCompra.jTextFieldfechaEntrega.setText(fecha);
				
		         
				
			}
				
});

		return fecha;
		
	}*/
	
	
	String getFecha(){
		return this.fecha;
	}
	
	

	private JPanel getJContentPane(JTextField campo) {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getCalendarioII(campo));
		}
		return jContentPane;
	}

}
