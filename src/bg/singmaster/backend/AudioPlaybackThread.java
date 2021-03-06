package bg.singmaster.backend;

import android.media.AudioTrack;
/**
 * base class for playing audio
 * */
public class AudioPlaybackThread implements Runnable {

	AudioTrack mAudioTrack;

	
	@Override
	public void run() {
    	android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_URGENT_AUDIO);
    	
    	 // start audio
        mAudioTrack.play();
        
     // synth loop 
      writeAudio();
        
        closeSynthesis();
        
	}
	
	/**
	 * implement in inherited classes
	 * */
	public void writeAudio(){}
	
	public void closeSynthesis(){
        mAudioTrack.stop();
        mAudioTrack.release();
	}
	
	
}
