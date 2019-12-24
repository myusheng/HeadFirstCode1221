package Chapter06_remote;
public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		//�����е�װ�ô����ں��ʵ�λ��
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		
		CeilingFan ceilingFan = new CeilingFan("Living room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
        //�������еĵ������װ��
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
        //�������ȵĿ��������		
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
		
		//���������ŵ�����������
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
		
		//��������Ŀ��������
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
		
		//�����Ѿ�����ȫ����������Խ����Ǽ��ص�ң���������
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
		
		//ʹ��toString��������ӡ��ÿ��ң�����Ĳ�ۺ������ƶ�������
		System.out.println(remoteControl);
		
		//�𲽰���ÿ����۵Ŀ���ذ�ť
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}

}
