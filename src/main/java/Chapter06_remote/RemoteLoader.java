package Chapter06_remote;
public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		//将所有的装置创建在合适的位置
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		
		CeilingFan ceilingFan = new CeilingFan("Living room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
        //创建所有的电灯命令装置
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
        //创建吊扇的开与关命令		
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
		
		//创建车库门的上与下命令
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
		
		//创建音响的开与关命令
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
		
		//现在已经有了全部的命令，可以将他们加载到遥控器插槽中
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
		
		//使用toString方法，打印出每个遥控器的插槽和它被制定的命令
		System.out.println(remoteControl);
		
		//逐步按下每个插槽的开与关按钮
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
