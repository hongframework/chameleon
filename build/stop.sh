#!/bin/bash

current_path=`pwd`
case "`uname`" in
    Linux)
		bin_abs_path=$(readlink -f $(dirname $0))
		;;
	*)
		bin_abs_path=`cd $(dirname $0); pwd`
		;;
esac
base=${bin_abs_path}/..
cd $base

pidfile=$base/build/hframe.pid
if [ ! -f "$pidfile" ];then
	echo "hframe is not running. exists"
	exit
fi

pid=`cat $pidfile`

echo -e "`hostname`: stopping hframe $pid ... "
kill -9 $pid
echo "stop Oook!"
rm $pidfile
