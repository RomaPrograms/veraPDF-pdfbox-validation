package org.verapdf.model.impl.pb.operator.type3font;

import org.apache.pdfbox.cos.COSBase;
import org.verapdf.model.impl.pb.operator.base.PBOperator;
import org.verapdf.model.operator.OpType3Font;

import java.util.List;

/**
 * @author Timur Kamalov
 */
public class PBOpType3Font extends PBOperator implements OpType3Font {

	public static final String OP_TYPE_3_FONT_TYPE = "OpType3Font";

	public PBOpType3Font(List<COSBase> arguments) {
		super(arguments);
		setType(OP_TYPE_3_FONT_TYPE);
	}

}
