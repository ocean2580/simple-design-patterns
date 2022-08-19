package ocean.behavior.template;

/**
 * 抽象诊断方法，因为现在只知道挂号和看医生是固定模式，剩下的开处方和拿药都是不确定的
 */
public abstract class AbstractDiagnosis {

    public void test(){
        System.out.println("今天头好晕，不想起床，开摆，先跟公司请个假");
        System.out.println("去医院看病了~");
        System.out.println("1 >> 先挂号");
        System.out.println("2 >> 等待叫号");
        //由于现在不知道该开什么处方，所以只能先定义一下行为，然后具体由子类实现
        //大致的流程先定义好就行
        this.prescribe();
        this.medicine();  //开药同理
    }

    public abstract void prescribe();   //开处方操作根据具体病症决定了

    public abstract void medicine();   //拿药也是根据具体的处方去拿
}

