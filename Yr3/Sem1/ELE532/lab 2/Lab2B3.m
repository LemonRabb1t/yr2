
% 3 ===========================================================

%{
% Create figure window and make visible on screen

u = @(t) 1.0*(t>=0);
x = @(t) 0.5*(u(t-4)-u(t-6));
h = @(t) 1.0*(u(t+5)-u(t+4));

dtau = 0.005; tau = -6:dtau:2.5;
ti = 0;
tvec = -5:.1:5;

y = NaN*zeros(1,length(tvec)); % Pre-allocate memory
for t = tvec
ti = ti+1; % Time index
xh = x(t-tau).*h(tau); lxh = length(xh);
y(ti) = sum(xh.*dtau); % Trapezoidal approximation of convolution integral
subplot(2,1,1),plot(tau,h(tau),'k-',tau,x(t-tau),'k--',t,0,'ok');
axis([tau(1) tau(end) -2.0 2.5]);
patch([tau(1:end-1);tau(1:end-1);tau(2:end);tau(2:end)],...
[zeros(1,lxh-1);xh(1:end-1);xh(2:end);zeros(1,lxh-1)],...
[.8 .8 .8],'edgecolor','none');

xlabel('\tau'); title('h(\tau) [solid], x(t-\tau) [dashed], h(\tau)x(t-\tau) [gray]');

c = get(gca,'children'); set(gca,'children',[c(2);c(3);c(4);c(1)]);

subplot(2,1,2),plot(tvec,y,'k',tvec(ti),y(ti),'ok');

xlabel('t');
ylabel('y(t) = \int h(\tau)x(t-\tau) d\tau');
axis([tau(1) tau(end) -1.0 2.0]); grid;
drawnow;
end
%}

% 4 ====================================================================

%{

% Create figure window and make visible on screen
u = @(t) 1.0*(t>=0);
x = @(t) 0.5*(u(t-3)-u(t-5));
h = @(t) 1.0*(u(t+5)-u(t+3));
dtau = 0.005; tau = -6:dtau:2.5;
ti = 0;
tvec = -5:.1:5;
y = NaN*zeros(1,length(tvec)); % Pre-allocate memory
for t = tvec
ti = ti+1; % Time index
xh = x(t-tau).*h(tau); lxh = length(xh);
y(ti) = sum(xh.*dtau); % Trapezoidal approximation of convolution integral
subplot(2,1,1),plot(tau,h(tau),'k-',tau,x(t-tau),'k--',t,0,'ok');
axis([tau(1) tau(end) -2.0 2.5]);
patch([tau(1:end-1);tau(1:end-1);tau(2:end);tau(2:end)],...
[zeros(1,lxh-1);xh(1:end-1);xh(2:end);zeros(1,lxh-1)],...
[.8 .8 .8],'edgecolor','none');
xlabel('\tau'); title('h(\tau) [solid], x(t-\tau) [dashed], h(\tau)x(t-\tau) [gray]');
c = get(gca,'children'); set(gca,'children',[c(2);c(3);c(4);c(1)]);
subplot(2,1,2),plot(tvec,y,'k',tvec(ti),y(ti),'ok');
xlabel('t');
ylabel('y(t) = \int h(\tau)x(t-\tau) d\tau');
axis([tau(1) tau(end) -1.0 2.0]); grid;
drawnow;
end

%}


% 5 =====================================================================


% Create figure window and make visible on screen
u = @(t) 1.0*(t>=0);
x = @(t) exp(t).*(u(t+2)-u(t));
h = @(t) exp(-2*t).*(u(t)-u(t-1));

dtau = 0.005; tau = -3:dtau:7.5;
ti = 0;
tvec = -5:.1:5;
y = NaN*zeros(1,length(tvec)); % Pre-allocate memory

for t = tvec
ti = ti+1; % Time index
xh = x(t-tau).*h(tau); lxh = length(xh);

y(ti) = sum(xh.*dtau); % Trapezoidal approximation of convolution integral

subplot(2,1,1),plot(tau,h(tau),'k-',tau,x(t-tau),'k--',t,0,'ok');
axis([tau(1) tau(end) -2.0 2.5]);
patch([tau(1:end-1);tau(1:end-1);tau(2:end);tau(2:end)],...
[zeros(1,lxh-1);xh(1:end-1);xh(2:end);zeros(1,lxh-1)],...
[.8 .8 .8],'edgecolor','none');
xlabel('\tau'); title('h(\tau) [solid], x(t-\tau) [dashed], h(\tau)x(t-\tau) [gray]');
c = get(gca,'children'); set(gca,'children',[c(2);c(3);c(4);c(1)]);
subplot(2,1,2),plot(tvec,y,'k',tvec(ti),y(ti),'ok');
xlabel('t');
ylabel('y(t) = \int h(\tau)x(t-\tau) d\tau');
axis([tau(1) tau(end) -1.0 2.0]); grid;
drawnow;
end

%}