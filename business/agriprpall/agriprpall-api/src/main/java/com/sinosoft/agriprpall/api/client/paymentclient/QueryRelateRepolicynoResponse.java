
package com.sinosoft.agriprpall.api.client.paymentclient;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryRelateRepolicynoReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "queryRelateRepolicynoReturn"
})
@XmlRootElement(name = "queryRelateRepolicynoResponse")
public class QueryRelateRepolicynoResponse {

    @XmlElement(required = true)
    protected String queryRelateRepolicynoReturn;

    /**
     * ��ȡqueryRelateRepolicynoReturn���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getQueryRelateRepolicynoReturn() {
        return queryRelateRepolicynoReturn;
    }

    /**
     * ����queryRelateRepolicynoReturn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQueryRelateRepolicynoReturn(String value) {
        this.queryRelateRepolicynoReturn = value;
    }

}
