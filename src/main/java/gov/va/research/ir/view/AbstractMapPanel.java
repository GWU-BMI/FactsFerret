package gov.va.research.ir.view;

import org.geotools.feature.SchemaException;
import org.locationtech.jts.geom.Coordinate;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Map;

public abstract class AbstractMapPanel extends JPanel implements PdfExportable {
	private static final long serialVersionUID = 1L;
	public abstract void reset();
    public abstract void dispose();
    public abstract void updateMap(final Map<Coordinate, Integer> coordinateSubtotalMap) throws IOException,
            SchemaException, SQLException, ClassNotFoundException,
            URISyntaxException;
    public void updateHp(final Map<String,Integer> hospital_data) {
    }
    public void updatePanel() {

    }
}