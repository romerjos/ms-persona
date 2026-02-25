package pe.gob.hospital.mspersona.util;

import pe.gob.hospital.mspersona.models.Paciente;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

public class Utilitario {

	private Utilitario() {
	}

	public static Paciente calcularEdad(Date fechNacimiento){
		Paciente edad = new Paciente();
		Calendar fechActual = Calendar.getInstance();
		Calendar fechNac = Calendar.getInstance();
		fechNac.setTime(fechNacimiento);
		fechActual.setTime(new Date());

		int anos = fechActual.get(Calendar.YEAR)-fechNac.get(Calendar.YEAR);
		int meses = fechActual.get(Calendar.MONTH)-fechNac.get(Calendar.MONTH);
		int dias = fechActual.get(Calendar.DAY_OF_MONTH)-fechNac.get(Calendar.DAY_OF_MONTH);

		if (dias <0){
			meses--;
			dias+= fechNac.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (meses<0){
			anos--;
			meses+=12;
		}

		edad.setANIO(anos);
		edad.setMES(meses);
		edad.setDIA(dias);
		return edad;
	}

    public static byte[] convertHexaToBytes(String hexadecimalText) {
        if (hexadecimalText == null || hexadecimalText.isEmpty()) {
            return null;
        }

        if (hexadecimalText.startsWith("0x") || hexadecimalText.startsWith("0X")) {
            hexadecimalText = hexadecimalText.substring(2);
        }

        int len = hexadecimalText.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexadecimalText.charAt(i), 16) << 4)
                    + Character.digit(hexadecimalText.charAt(i + 1), 16));
        }
        return data;
    }

    public static String convertHexaToBase64(String hexadecimalText) {
        byte[] bytes = convertHexaToBytes(hexadecimalText);
        return (bytes == null) ? "" : Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] generarImagenPorDefecto() {
        try {
            int width = 200;
            int height = 200;
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            Graphics2D g2d = image.createGraphics();
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, width, height);

            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 16));
            String texto = "SIN IMAGEN";
            FontMetrics fm = g2d.getFontMetrics();
            int x = (width - fm.stringWidth(texto)) / 2;
            int y = (height - fm.getHeight()) / 2 + fm.getAscent();
            g2d.drawString(texto, x, y);
            g2d.dispose();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpeg", baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Error generando imagen por defecto", e);
        }
    }
}
