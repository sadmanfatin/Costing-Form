package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 18 19:24:20 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MNJPOC_Bpo_UploadImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BpoNo {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getBpoNo();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        BpoQty {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getBpoQty();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setBpoQty((String)value);
            }
        }
        ,
        Classific {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getClassific();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setClassific((String)value);
            }
        }
        ,
        PoType {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getPoType();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setPoType((String)value);
            }
        }
        ,
        DeliveryTerms {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getDeliveryTerms();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setDeliveryTerms((String)value);
            }
        }
        ,
        BpoStatus {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getBpoStatus();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setBpoStatus((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getLineId();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        RowID {
            public Object get(MNJPOC_Bpo_UploadImpl obj) {
                return obj.getRowID();
            }

            public void put(MNJPOC_Bpo_UploadImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MNJPOC_Bpo_UploadImpl object);

        public abstract void put(MNJPOC_Bpo_UploadImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int BPOQTY = AttributesEnum.BpoQty.index();
    public static final int CLASSIFIC = AttributesEnum.Classific.index();
    public static final int POTYPE = AttributesEnum.PoType.index();
    public static final int DELIVERYTERMS = AttributesEnum.DeliveryTerms.index();
    public static final int BPOSTATUS = AttributesEnum.BpoStatus.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int ROWID = AttributesEnum.RowID.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MNJPOC_Bpo_UploadImpl() {
    }

    /**
     * Gets the attribute value for BpoNo, using the alias name BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String)getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoNo.
     * @param value value to set the BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for BpoQty, using the alias name BpoQty.
     * @return the BpoQty
     */
    public String getBpoQty() {
        return (String)getAttributeInternal(BPOQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoQty.
     * @param value value to set the BpoQty
     */
    public void setBpoQty(String value) {
        setAttributeInternal(BPOQTY, value);
    }

    /**
     * Gets the attribute value for Classific, using the alias name Classific.
     * @return the Classific
     */
    public String getClassific() {
        return (String)getAttributeInternal(CLASSIFIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for Classific.
     * @param value value to set the Classific
     */
    public void setClassific(String value) {
        setAttributeInternal(CLASSIFIC, value);
    }

    /**
     * Gets the attribute value for PoType, using the alias name PoType.
     * @return the PoType
     */
    public String getPoType() {
        return (String)getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoType.
     * @param value value to set the PoType
     */
    public void setPoType(String value) {
        setAttributeInternal(POTYPE, value);
    }

    /**
     * Gets the attribute value for DeliveryTerms, using the alias name DeliveryTerms.
     * @return the DeliveryTerms
     */
    public String getDeliveryTerms() {
        return (String)getAttributeInternal(DELIVERYTERMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryTerms.
     * @param value value to set the DeliveryTerms
     */
    public void setDeliveryTerms(String value) {
        setAttributeInternal(DELIVERYTERMS, value);
    }

    /**
     * Gets the attribute value for BpoStatus, using the alias name BpoStatus.
     * @return the BpoStatus
     */
    public String getBpoStatus() {
        return (String)getAttributeInternal(BPOSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoStatus.
     * @param value value to set the BpoStatus
     */
    public void setBpoStatus(String value) {
        setAttributeInternal(BPOSTATUS, value);
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for RowID, using the alias name RowID.
     * @return the RowID
     */
    public RowID getRowID() {
        return (RowID)getAttributeInternal(ROWID);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MNJPOC_Bpo_Upload");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
