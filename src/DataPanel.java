import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DataPanel extends JPanel {
    private final JTextField txtLength = new JTextField(10);
    private final JTextField txtHeight = new JTextField(10);
    private final JTextField txtWidth = new JTextField(10);
    private final JTextField txtRadius = new JTextField(10);
    private final JTextField txtBaseWidth = new JTextField(10);
    private final JLabel lblLength = new JLabel("Length:");
    private final JLabel lblHeight = new JLabel("Height:");
    private final JLabel lblWidth = new JLabel("Width:");
    private final JLabel lblRadius = new JLabel("Radius:");
    private final JLabel lblBaseWidth = new JLabel("Base Width:");
    GridBagConstraints gc = new GridBagConstraints();

    public DataPanel() {
        setLayout(new GridBagLayout());

        Border innerBorder = BorderFactory.createTitledBorder("Volume Calculator");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }

    public void setCubePanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        refreshPanel();
    }

    public void setCylinderPanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblRadius, gc);

        gc.gridx = 1;
        add(txtRadius, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        refreshPanel();
    }

    public void setSpherePanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblRadius, gc);

        gc.gridx = 1;
        add(txtRadius, gc);

        refreshPanel();
    }

    public void setSquarePyramidPanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(lblHeight, gc);

        gc.gridx = 1;
        add(txtHeight, gc);

        refreshPanel();
    }

    public void setEquilateralTriangularPrismPanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(lblBaseWidth, gc);

        gc.gridx = 1;
        add(txtBaseWidth, gc);

        refreshPanel();
    }

    public void setCuboidPanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(lblHeight, gc);

        gc.gridx = 1;
        add(txtHeight, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(lblWidth, gc);

        gc.gridx = 1;
        add(txtWidth, gc);

        refreshPanel();
    }

    public void clearPanel() {
        this.removeAll();
        txtBaseWidth.setText("");
        txtHeight.setText("");
        txtLength.setText("");
        txtRadius.setText("");
        txtWidth.setText("");
    } // Each time a button is pressed, clear the panel and the data from each text field

    public void refreshPanel() {
        this.revalidate();
        this.repaint();
    }
}
