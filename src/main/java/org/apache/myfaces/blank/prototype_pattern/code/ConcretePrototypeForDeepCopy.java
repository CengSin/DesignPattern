package org.apache.myfaces.blank.prototype_pattern.code;

import org.apache.myfaces.blank.prototype_pattern.SubClassForDeepCopy;

import java.io.*;

/**
 * @author zhangzetao
 */
public class ConcretePrototypeForDeepCopy implements Cloneable, Serializable {

    private int a;

    private SubClassForDeepCopy subClassForDeepCopy;

    @Override
    protected ConcretePrototypeForDeepCopy clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
            return (ConcretePrototypeForDeepCopy) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototypeForDeepCopy c2 = new ConcretePrototypeForDeepCopy();
        c2.setA(1);
        c2.setSubClassForDeepCopy(new SubClassForDeepCopy(1, 2));

        ConcretePrototypeForDeepCopy clone = (ConcretePrototypeForDeepCopy) c2.clone();

        clone.getSubClassForDeepCopy().setA(3);
        clone.getSubClassForDeepCopy().setB(4);

        System.out.println(c2.getSubClassForDeepCopy().getA() + " : " + c2.getSubClassForDeepCopy().getB());
        System.out.println(clone.getSubClassForDeepCopy().getA() + " : " + clone.getSubClassForDeepCopy().getB());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public SubClassForDeepCopy getSubClassForDeepCopy() {
        return subClassForDeepCopy;
    }

    public void setSubClassForDeepCopy(SubClassForDeepCopy subClassForDeepCopy) {
        this.subClassForDeepCopy = subClassForDeepCopy;
    }
}
