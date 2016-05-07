use Time::HiRes qw(time);
use POSIX qw(strftime);
use strict;
use warnings;
 
my $filename = 'DataFile.csv';

print "Processing File\n";
my $startTime = time();

if (open(my $fh, '<:encoding(UTF-8)', $filename)) {
  	while (my $row = <$fh>) {
    	my @row = split(",",$row);
  	}
} else {
  	warn "Could not open file '$filename' $!";
}

my $endTime = time();
my $runTime = ($endTime - $startTime) * 1000 ;
print "IO Perl Time: $runTime ms\n";