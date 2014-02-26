/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFileChooser;
import java.io.File;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import it.sauronsoftware.jave.VideoSize;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.Encoder;
import javax.swing.JOptionPane;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.InputFormatException;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Mayukh Nair
 */
public class ConvertX extends javax.swing.JFrame {

    /**
     * Creates new form ConvertX
     */
    public ConvertX() {
        initComponents();
    }
     public String fileLocn;
     public String filax;
     public String audiocodec,videocodec,formatid,format;
     public int bitra,chana,sampa,bitrv,framv,size1,size2;
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filelocation = new javax.swing.JTextField();
        BrowseButton = new javax.swing.JButton();
        formatpanel = new javax.swing.JPanel();
        VideoFormatBox = new javax.swing.JComboBox();
        AudioFormatBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parampanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        audioparam = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bitr_a = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chan_a = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        samp_a = new javax.swing.JTextField();
        videoparam = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bitr_v = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fram_v = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        size_1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        size_2 = new javax.swing.JTextField();
        StartButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        progbar = new javax.swing.JProgressBar();
        AboutButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConvertX-Video Converter");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose your file"));

        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(filelocation, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BrowseButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formatpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Convert to what?"));

        VideoFormatBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Flash Video (.flv)", "Audio Video Interleave (.avi)", "MPEG-4 Video (.mp4)", "3GPP Video (.3gp)", "DVD Video (.vob)" }));
        VideoFormatBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VideoFormatBoxActionPerformed(evt);
            }
        });

        AudioFormatBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MPEG-4 Audio Layer 3 (.mp3)", "Wave Audio (.wav)", "OGG Vorbis Audio (.ogg)" }));
        AudioFormatBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudioFormatBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Video Formats");

        jLabel2.setText("Audio Formats");

        javax.swing.GroupLayout formatpanelLayout = new javax.swing.GroupLayout(formatpanel);
        formatpanel.setLayout(formatpanelLayout);
        formatpanelLayout.setHorizontalGroup(
            formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatpanelLayout.createSequentialGroup()
                .addGroup(formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VideoFormatBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AudioFormatBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        formatpanelLayout.setVerticalGroup(
            formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formatpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VideoFormatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AudioFormatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        parampanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Geeky Stuff"));
        parampanel.setEnabled(false);

        jLabel3.setText("Unless you know what these parameters mean, you don't need to change them.");

        jLabel4.setText("ConvertX will take care of it.");

        audioparam.setBorder(javax.swing.BorderFactory.createTitledBorder("Audio Parameters"));
        audioparam.setEnabled(false);

        jLabel6.setText("Bitrate:");

        jLabel7.setText("No. of channels:");

        jLabel8.setText("Sampling rate:");

        javax.swing.GroupLayout audioparamLayout = new javax.swing.GroupLayout(audioparam);
        audioparam.setLayout(audioparamLayout);
        audioparamLayout.setHorizontalGroup(
            audioparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioparamLayout.createSequentialGroup()
                .addGroup(audioparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(audioparamLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitr_a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chan_a, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(audioparamLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(samp_a, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        audioparamLayout.setVerticalGroup(
            audioparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioparamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(audioparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bitr_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(chan_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(audioparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(samp_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        videoparam.setBorder(javax.swing.BorderFactory.createTitledBorder("Video Parameters"));
        videoparam.setEnabled(false);

        jLabel9.setText("Bitrate:");

        jLabel10.setText("Frame rate:");

        jLabel11.setText("Resolution:");

        jLabel12.setText("x");

        javax.swing.GroupLayout videoparamLayout = new javax.swing.GroupLayout(videoparam);
        videoparam.setLayout(videoparamLayout);
        videoparamLayout.setHorizontalGroup(
            videoparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoparamLayout.createSequentialGroup()
                .addGroup(videoparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(videoparamLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitr_v, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fram_v))
                    .addGroup(videoparamLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(size_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(size_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        videoparamLayout.setVerticalGroup(
            videoparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(videoparamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(videoparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bitr_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fram_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(videoparamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(size_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(size_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StartButton.setText("Start");
        StartButton.setEnabled(false);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        progbar.setMaximum(1000);

        AboutButton.setText("About");
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parampanelLayout = new javax.swing.GroupLayout(parampanel);
        parampanel.setLayout(parampanelLayout);
        parampanelLayout.setHorizontalGroup(
            parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parampanelLayout.createSequentialGroup()
                .addGroup(parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(parampanelLayout.createSequentialGroup()
                        .addGroup(parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(videoparam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(audioparam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(parampanelLayout.createSequentialGroup()
                .addComponent(progbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        parampanelLayout.setVerticalGroup(
            parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parampanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(parampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parampanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(audioparam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(videoparam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parampanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(StartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AboutButton)))
                .addGap(18, 18, 18)
                .addComponent(progbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel13.setText("ConvertX version 0.1 Alpha © 2014 Mayukh Nair. All rights reserved.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formatpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parampanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formatpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parampanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        // TODO add your handling code here:
        AudioFormatBox.setEnabled(true);
        JFileChooser FilePicker=new JFileChooser();
        int returnVal = FilePicker.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file=FilePicker.getSelectedFile();
        formatpanel.setEnabled(true);
        fileLocn=file.getPath();
        filelocation.setText(fileLocn);
        filax=fileLocn.substring(0, fileLocn.indexOf("."));
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void VideoFormatBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideoFormatBoxActionPerformed
        // TODO add your handling code here:
        AudioFormatBox.setEnabled(false);
        parampanel.setEnabled(true);
        audioparam.setEnabled(true);
        videoparam.setEnabled(true);
        StartButton.setEnabled(true);
        int state=VideoFormatBox.getSelectedIndex();
        switch(state){
            case 0:audiocodec="libmp3lame";
                   bitra=64000;
                   chana=1;
                   sampa=22050;
                   videocodec="flv";
                   bitrv=160000;
                   framv=15;
                   size1=640;
                   size2=480;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   bitr_v.setText(""+bitrv);
                   fram_v.setText(""+framv);
                   size_1.setText(""+size1);
                   size_2.setText(""+size2);
                   formatid=".flv";
                   format="flv";
                   break;
           case 1:audiocodec="libmp3lame";
                   bitra=64000;
                   chana=1;
                   sampa=22050;
                   videocodec="libxvid";
                   bitrv=192000;
                   framv=30;
                   size1=640;
                   size2=480;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   bitr_v.setText(""+bitrv);
                   fram_v.setText(""+framv);
                   size_1.setText(""+size1);
                   size_2.setText(""+size2);
                   formatid=".avi";
                   format="avi";
                   break;
           case 2:audiocodec="libmp3lame";
                   bitra=96000;
                   chana=1;
                   sampa=44100;
                   videocodec="mpeg4";
                   bitrv=192000;
                   framv=30;
                   size1=640;
                   size2=480;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   bitr_v.setText(""+bitrv);
                   fram_v.setText(""+framv);
                   size_1.setText(""+size1);
                   size_2.setText(""+size2);
                   formatid=".avi";
                   format="avi";
                   break;
        case 3:audiocodec="libfaac";
                   bitra=12000;
                   chana=1;
                   sampa=8000;
                   videocodec="h263";
                   bitrv=240000;
                   framv=30;
                   size1=176;
                   size2=144;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   bitr_v.setText(""+bitrv);
                   fram_v.setText(""+framv);
                   size_1.setText(""+size1);
                   size_2.setText(""+size2);
                   formatid=".3gp";
                   format="3gp";
                   break;
        case 4:audiocodec="libmp3lame";
                   bitra=384000;
                   chana=1;
                   sampa=48000;
                   videocodec="mpeg2video";
                   bitrv=4000000;
                   framv=30;
                   size1=720;
                   size2=480;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   bitr_v.setText(""+bitrv);
                   fram_v.setText(""+framv);
                   size_1.setText(""+size1);
                   size_2.setText(""+size2);
                   formatid=".vob";
                   format="vob";
                   break;
                  
        }
         
    }//GEN-LAST:event_VideoFormatBoxActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
   System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        try{
        File input=new File(fileLocn);
        File output=new File(filax+formatid);
       
        AudioAttributes audio=new AudioAttributes();
        audio.setCodec(audiocodec);
        audio.setBitRate(Integer.parseInt(bitr_a.getText()));
        audio.setChannels(Integer.parseInt(chan_a.getText()));
        audio.setSamplingRate(Integer.parseInt(samp_a.getText()));
        if(formatid.equals(".flv") && formatid.equals(".mp4") && formatid.equals(".avi") && formatid.equals(".vob") && formatid.equals(".3gp")){
         VideoAttributes video=new VideoAttributes();
        video.setCodec(videocodec);
        video.setBitRate(Integer.parseInt(bitr_v.getText()));
        video.setFrameRate(Integer.parseInt(fram_v.getText()));
        video.setSize(new VideoSize(Integer.parseInt(size_1.getText()),Integer.parseInt(size_2.getText())));
        EncodingAttributes attrs=new EncodingAttributes();
        attrs.setFormat(format);
        attrs.setAudioAttributes(audio);
        attrs.setVideoAttributes(video);
        Encoder encode=new Encoder();
        encode.encode(input, output, attrs);
        }
        EncodingAttributes attrs=new EncodingAttributes();
        attrs.setFormat(format);
        attrs.setAudioAttributes(audio);
        Encoder encode=new Encoder();
        encode.encode(input, output, attrs);
        }
       catch (EncoderException | IllegalArgumentException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        // TODO add your handling code here:
        Credits.main(null);
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void AudioFormatBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudioFormatBoxActionPerformed
        // TODO add your handling code here:
        VideoFormatBox.setEnabled(false);
        parampanel.setEnabled(true);
        audioparam.setEnabled(true);
        videoparam.setEnabled(false);
        StartButton.setEnabled(true);
        int state=AudioFormatBox.getSelectedIndex();
        switch(state){
            case 0:audiocodec="libmp3lame";
                   bitra=64000;
                   chana=1;
                   sampa=22050;
                   bitr_a.setText(""+bitra);
                   chan_a.setText(""+chana);
                   samp_a.setText(""+sampa);
                   formatid=".mp3";
                   format="mp3";
                   break;
        }
    }//GEN-LAST:event_AudioFormatBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvertX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JComboBox AudioFormatBox;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JComboBox VideoFormatBox;
    private javax.swing.JPanel audioparam;
    private javax.swing.JTextField bitr_a;
    private javax.swing.JTextField bitr_v;
    private javax.swing.JTextField chan_a;
    private javax.swing.JTextField filelocation;
    private javax.swing.JPanel formatpanel;
    private javax.swing.JTextField fram_v;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel parampanel;
    private javax.swing.JProgressBar progbar;
    private javax.swing.JTextField samp_a;
    private javax.swing.JTextField size_1;
    private javax.swing.JTextField size_2;
    private javax.swing.JPanel videoparam;
    // End of variables declaration//GEN-END:variables
}
