package de.fhg.iais.roberta.syntax.sensor;

import de.fhg.iais.roberta.shared.sensor.ev3.SensorPort;
import de.fhg.iais.roberta.syntax.BlockType;
import de.fhg.iais.roberta.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.syntax.BlocklyComment;

public abstract class BaseSensor<V> extends Sensor<V> {
    private final SensorPort port;

    /**
     * This constructor set the kind of the sensor object used in the AST (abstract syntax tree). All possible kinds can be found in {@link BlockType}.
     *
     * @param kind of the the sensor object used in AST,
     * @param properties of the block (see {@link BlocklyBlockProperties}),
     * @param comment of the user for the specific block
     */
    public BaseSensor(SensorPort port, BlockType kind, BlocklyBlockProperties properties, BlocklyComment comment) {
        super(kind, properties, comment);
        this.port = port;
    }

    /**
     * @return get the port on which the sensor is connected. See enum {@link SensorPort} for all possible sensor ports
     */
    public SensorPort getPort() {
        return this.port;
    }
}
