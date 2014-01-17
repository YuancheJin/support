ant war
sudo rm -R /var/lib/tomcat7/webapps/support*
sudo rm /mnt/support/log/*
sudo rm /var/log/tomcat7/*
sudo cp dist/support.war /var/lib/tomcat7/webapps/
sudo service tomcat7 restart
